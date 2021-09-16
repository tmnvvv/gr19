import java.util.Scanner;

public class CalcVdovinA
{
      public static int UserNumber;
      public static int numberOne;
      public static int numberTwo;
      public static Scanner userInputNumber = new Scanner(System.in);
      public static char calcOperationUser;
      public static int resultOperation;
	public static void main(String[] args) {

            numberOne = GetUserNumber();
            numberTwo = GetUserNumber();
            calcOperationUser = getUserOperation();
            resultOperation = calc();
            System.out.println("=: "+resultOperation);
	}
      public static int GetUserNumber(){
            System.out.println("Введите число");
            try {
                if(userInputNumber.hasNextInt()){
                    UserNumber = userInputNumber.nextInt();
                } else {
                        System.out.println("Введите число повторно, возможно Вы допустили ошибку");
                         userInputNumber.next();
                         numberOne = GetUserNumber();
                       } 
                 } catch(Exception e) {
                   e.printStackTrace();
                 }
            return UserNumber;    
      }
      public static char getUserOperation(){
            System.out.println("Введите мат.операцию:");
            try {
             if(userInputNumber.hasNext()){
                        calcOperationUser = userInputNumber.next().charAt(0);
              } else {
                    System.out.println("Введите число повторно, возможно Вы допустили ошибку");
                   userInputNumber.next();
                   calcOperationUser = getUserOperation();
              }
              } catch(Exception e) {
                  e.printStackTrace();     
              }
              return calcOperationUser;
        }
         
        public static int calc(){
            switch (calcOperationUser){
                case '+':
                resultOperation = numberOne+numberTwo;
                    break;
                case '-':
                resultOperation = numberOne-numberTwo;
                    break;
                case '*':
                resultOperation = numberOne*numberTwo;
                    break;
                case '/':
                resultOperation = numberOne/numberTwo;
                    break;
                default:
                    System.out.println("Повторите ввод, что-то пошло не так");
                    resultOperation = calc();
             }
             return resultOperation;
        }
       
}
