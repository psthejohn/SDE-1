public class DAY1_CALCULATOR{
    
    public static void main(String[] args) {
        DAY1_CALCULATOR calc = new DAY1_CALCULATOR();
        calc.calculator(4,4,'+');
        calc.calculator(4,4,'-');
        calc.calculator(4,4,'/');
        calc.calculator(4,4,'*');
        calc.calculator(4,4,'+');
    }
    
    private float calculator(float num1, float num2, char operation){
        float result = 0.0f;
        switch(operation){
            case '+':
            result = num1+num2;
            System.out.println(num1+num2);
                break;
            case '-':
            result = num1-num2;
            System.out.println(result);
                break;
            case '/':
            result = num1/num2;
            System.out.println(result);
                break;
            case '*':
            result = num1*num2;
            System.out.println(result);
                break;
            default:
            System.out.println("Please enter a valid input");
                break;
        }
        return  result;      
    }
}