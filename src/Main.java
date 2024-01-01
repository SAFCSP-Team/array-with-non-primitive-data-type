public class Main {
    public static void main(String[] args) {
        public class Main {
    public static void main(String[] args) {
        Book [] books = new Book[5];
        books[0] = new Book("harrypotter", "jk rowling", 1992 );
        books[1] = new Book("davinci code", "dan brown", 1922);
        books[2] = new Book("art of war", "suntzu", 1229);
        books[3] = new Book("lessoms from history", "ariel", 1992);
        books[4] = new Book("Greatest minds and ideas", "Will", 1038);
        
        for(int i = 0; i < books.length; i++){
            System.out.println(books[i].getTitle());

        }

        Student [] students = new Student[3];
        students[0] = new Student(20, 123, "sarah");
        students[1] = new Student(13, 88, "monirah");
        students[2] = new Student(3, 3, "noura");

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].getName() + ' ' + students[i].getId());
        }

    }
}


    }
}
public class Student{
    private int age;
    private int id;
    private String name;

    public Student(int age, int id, String name){
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge (int age){
        this.age = age;

    }

    public int getId(){
        return id;
    }

    public void  setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName (String name){
         this.name = name;
    }





}
