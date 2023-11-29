package CodingWithJohn;

public class Lambdas{
    public static void main(String[] args) {

//        Cat myCat = new Cat();
        Printable lambdaPrintable = (s, p) -> System.out.println(p + " meow " + s);
        printThing(lambdaPrintable);

    }

    static void printThing(Printable thing){
        thing.print("!", "anus");
    }
}
