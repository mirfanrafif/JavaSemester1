public class PostFix {
    int n;
    int top;
    char[] stack;

    PostFix(int total){
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }

    void push(char c){
        top++;
        stack[top] = c;
    }
    char pop(){
        char item = stack[top];
        top--;
        return item;
    }

    String convert(String q){
        String p = "";
        char c;
        for (int i = 0; i < n; i++) {
            c = q.charAt(i);
            if (isOperand(c))
                p = p+c;
            if (c=='(')
                push(c);
            if (isOperator(c))
            {
                while (presedence(stack[top]) >= presedence(c))
                    p = p+pop();
                push(c);
            }
            if (c==')'){
                while (stack[top]!='(')
                    p  = p + pop();
                char temp = pop();
            }
        }
        return p;
    }

    boolean isOperand(char c){
        if ((c>='A' && c<='Z') || (c>='a' && c<='z') || c>='0' && c<='9' || c==' '|| c=='.' ){
            return true;
        }else{
            return false;
        }
    }

    boolean isOperator(char c){
        if (c=='^' || c=='%' || c=='/' || c=='*' || c=='-' || c=='+'){
            return true;
        }else{
            return false;
        }
    }

    int presedence(char c){
        switch (c){
            case '^' : return 3;
            case '%' : return 2;
            case '/' : return 2;
            case '*' : return 2;
            case '-' : return 1;
            case '+' : return 1;
            default: return 0;
        }
    }
}
