//Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки. Если значение null, то параметр не должен попадать в запрос. Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//Ответ: "select * from students where name = 'Ivanov' and country = 'Russia' and city = 'Moscow'" для приведенного примера

public class Task02 {
    public static void main(String[] args) {
        String str = "select * from student where";
        StringBuilder sb = new StringBuilder();
        String[] keys = {'name', 'country', 'city', 'age'};
        String[] names = {'Ivanov', 'Russia', 'Moskow'};
        for(int i = 0; i < keys.length(); i++){
            if(names != 'null'){
                sb.append(keys[i]);
                sb.append('=');
                sb.append(names[i]);
                if(i != keys.length() - 1){
                    sb.append('and');
                }
            }
        }
        System.out,println(sb);
    }
}
