class Employee{
    private firstName: String;
    private lastName: String;
    private salary: Number;
    private gender: String;
    private email: String;

    constructor(f: String, l:String, s: Number, g: String, e: String){
        this.firstName = f;
        this.lastName = l;
        this.salary = s;
        this.gender = g;
        this.email = e;
    }
   // constructor(
     //   public firstName: String,
    //    public lastName: String,
    //    public salary: Number,
    //    public gender: String,
    //    public email: Striing
   // )
   getFullName(){
       console.log(this.firstName+ " "+this.lastName+" "+this.salary+" "+this.gender+" "+this.email)
   }
}
let emp = new Employee("Akshat","Vishnoi",50000,"M","av@email.com");
emp.getFullName();