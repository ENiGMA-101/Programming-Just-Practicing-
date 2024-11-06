#include <stdio.h>
#include <string.h>
int main()
{
    char infix[100], postfix[200], stack[100];
    int top = -1, index = 0;
    printf("Enter the infix expression: ");
    scanf("%s", infix);
    for (int i = 0; i < strlen(infix); i++)
    {
        char ch = infix[i];
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))
        {
            postfix[index++] = ch;
            postfix[index++] = ' ';
        }
        else if (ch == '(')
            stack[++top] = ch;
        else if (ch == ')')
        {
            while (top != -1 && stack[top] != '(')
            {
                postfix[index++] = stack[top--];
                postfix[index++] = ' ';
            }
            if (top != -1 && stack[top] == '(')
                top--;
        }
        else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch == '%')
        {
            int pre_ch;
            if (ch == '^')
                pre_ch = 3;
            else if (ch == '*' || ch == '/' || ch == '%')
                pre_ch = 2;
            else
                pre_ch = 1;
            while (top != -1 && stack[top] != '(')
            {
                int pre_top;
                if (stack[top] == '^')
                    pre_top = 3;
                else if (stack[top] == '*' || stack[top] == '/' || stack[top] == '%')
                    pre_top = 2;
                else
                    pre_top = 1;
                if (pre_top >= pre_ch)
                {
                    postfix[index++] = stack[top--];
                    postfix[index++] = ' ';
                }
                else
                    break;
            }
            stack[++top] = ch;
        }
    }
    while (top != -1)
    {
        postfix[index++] = stack[top--];
        postfix[index++] = ' ';
    }
    postfix[index] = '\0';
    printf("The corresponding postfix expression is: %s\n", postfix);
    return 0;
}
