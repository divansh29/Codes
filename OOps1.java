class Main {
    public static void main(String[] args) {
        Student[] students=new Student[5];
        Student kunal=new Student();
        Student rahul=new Student(33,"naam",88.9f);
        
        System.out.println(kunal.name);
            System.out.println(kunal.marks);
            System.out.println(rahul.name);
        
        
        
    }
}
class Student{
    int rn;
    String name;
    float marks;
    Student(){
        this.rn=132;
        this.name="Kunal";
        this.marks=88.5f;
        
    }
    Student(int rn,String name,float marks){
        this.rn=rn;
        this.name=name;
        this.marks=marks;
    }
    
    
    
    
    
    
    
}
