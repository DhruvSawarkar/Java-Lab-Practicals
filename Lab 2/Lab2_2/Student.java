class Student implements Printable,Showable{
    private String name;
    private int roll_no;
    private float marks;
    
    public Student(String name, int roll_no , float marks){
        this.name=name;
        this.roll_no=roll_no;
        this.marks=marks;
    }
    
    @Override
    public void print(){
        System.out.println("Printing Student Details....");
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+roll_no);
        System.out.println("Marks : "+marks);
    }
    
    @Override
    public void show(){
        System.out.println("Showing Student Information....");
        System.out.println("Student "+name+" Roll no "+roll_no+" got "+marks+" Marks.");
    }
}

