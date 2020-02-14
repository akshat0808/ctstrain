var Employeee = /** @class */ (function () {
    function Employeee(f, l, s, g, e) {
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
    Employeee.prototype.getFullName = function () {
        console.log(this.firstName + " " + this.lastName + " " + this.salary + " " + this.gender + " " + this.email);
    };
    return Employeee;
}());
var emp = new Employeee("Akshat", "Vishnoi", 50000, "M", "av@email.com");
emp.getFullName();
