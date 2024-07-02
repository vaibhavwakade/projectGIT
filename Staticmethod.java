class Staticmethod
{
    System.out.println(rollno+" "+name+" "+college);

int rollno;
String name;
static String college="abc";

static void change()
{
college="xyz";
}
Staticmethod(int r,String n)
{
rollno=r;
name=n;
}

void display()
{
System.out.println(rollno+" "+name+" "+college);
}

public static void main(String args[])

{
Staticmethod.change();//classname.static method name

Staticmethod s= new Staticmethod(1,"swapanali");
Staticmethod s1= new Staticmethod(2,"vaibhav");
Staticmethod s2= new Staticmethod(3,"wakade");
Staticmethod s3= new Staticmethod(4,"santosh");


s.display();
s1.display();
s2.display();
s3.display();
}
}





