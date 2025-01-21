#include <bits/stdc++.h>
using namespace std;
int main()
{
    string infix, postfix = "";
    char stack[100];
    int top = -1;
    cout << "Enter the infix expression: ";
    cin >> infix;
    for (int i = 0; i < infix.length(); i++)
    {
        char c = infix[i];
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))
        {
            postfix += c;
        }
        else if (c == '(')
        {
            stack[++top] = c;
        }
        else if (c == ')')
        {
            while (top != -1 && stack[top] != '(')
            {
                postfix += stack[top--];
            }
            top--;
        }
        else if (c == '+' || c == '-' || c == '*' || c == '/' || c=='^' || c== '%')
        {
            int precedence_c;
            if (c == '+' || c == '-')
            {
                precedence_c = 1;
            }
            else if(c == '*' || c == '/' || c=='%' )
            {
                precedence_c = 2;
            }
            else
            {
                precedence_c = 3;
            }
            while (top != -1 && stack[top] != '(')
            {
                int precedence_top;
                if (stack[top] == '+' || stack[top] == '-')
                {
                    precedence_top = 1;
                }
                else if(stack[top] == '*' || stack[top] == '/' || stack[top]=='%')
                {
                    precedence_top = 2;
                }
                else
                {
                    precedence_top = 3;
                }

                if (precedence_top >= precedence_c)
                {
                    postfix += stack[top--];
                }
                else
                {
                    break;
                }
            }
            stack[++top] = c;
        }
    }
    while (top != -1)
    {
        postfix += stack[top--];
    }
    cout << "The corresponding postfix expression is: " << postfix <<" "<< endl;
    return 0;
}
