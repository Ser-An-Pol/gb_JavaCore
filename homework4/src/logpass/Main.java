package logpass;

/**
 * Задание 1
 * Задача: Проверка логина и пароля
 * 1. Создать статический метод который принимает на вход три
 * параметра: login, password и confirmPassword.
 * 2. Длина login должна быть меньше 20 символов. Если login не
 * соответствует этим требованиям, необходимо выбросить
 * logpass.WrongLoginException.
 * 3. Длина password должна быть меньше 20 символов. Также password
 * и confirmPassword должны быть равны. Если password не
 * соответствует этим требованиям, необходимо выбросить
 * logpass.WrongPasswordException.
 * 4. logpass.WrongPasswordException и logpass.WrongLoginException - пользовательские
 * классы исключения с двумя конструкторами – один по умолчанию,
 * второй принимает сообщение исключения и передает его в
 * конструктор класса Exception.
 * 5. В основном классе программы необходимо по-разному обработать
 * исключения.
 * 6. Метод возвращает true, если значения верны или false в другом
 * случае.
 * ---------------------------------------------------------------------
 */

public class Main {
    public static void main(String[] args) {
        Boolean resVerify = false;
        try {
            resVerify = verifyLogPass("kfhwghdfdwepfhg", "wqpeufopsdfdsfsdqwuew", "wieyoqwyqwe");
        } catch (WrongLoginException e) {
            throw new RuntimeException(e);
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(resVerify);
    }


    public static boolean verifyLogPass(String login, String password, String confirmPassword)
                                                                throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20) {
            throw new WrongLoginException();
        }
        if (password.length() >= 20) {
            throw new WrongPasswordException("Длина пароля >= 20 символов");
        }
        if (password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль и подтверждение не совпадают");
        }
        return true;
    }

}