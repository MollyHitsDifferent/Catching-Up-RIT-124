package ArrayStuff;

public class ForEach<E> {
    public static void forArray(String[] array) {
        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void forList(List<String> x) {
        for (String y : x) {
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        String[] stringArray = { "LOL", "NICE", "1337", "B055" };
        ArrayList<String> stringList = new ArrayList<>();
        stringList.append("xxxx");
        stringList.append("xdxdxdxdxdxdd");
        stringList.append("xdxdxdxdxdxdd");
        forArray(stringArray);
        forList(stringList);
    }
}
