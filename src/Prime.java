public class Prime {
    //Главная функция класса
    //Проходит по всем числам до 100, проверяя с помощью функции isPrime
    //является ли оно простым.
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++){
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    //Функция проверки является ли число простым
    public static boolean isPrime(int n){
        if (n <= 1) {   //откидывание всех чисел меньше 2
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {   //Проверка на деление всех числел до корня n
            if (n % i == 0) {                           //так как выше искать нет смысла
                return false;
            }
        }
        return true;    //если же делитель не был найден, возвращаем true
    }
}

