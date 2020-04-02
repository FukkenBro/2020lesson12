
//1) Написать метод `String reverse(String s) {...}`.
//        Входящий параметр: s - строка которая состоит из слов через пробел
//        Метод должен вернуть слова в обратном порядке
//        Пример:
//        "man has dog" => "dog has man"
public class Task1 {
    public static void main(String[] args) {
        String s = "man has dog";
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder("");
        int n = words.length-1;
        for (int i = n; i >=0 ; i--) {
            sb.append(words[i]).append(" ");
        }
        System.out.println(sb);
    }

}
