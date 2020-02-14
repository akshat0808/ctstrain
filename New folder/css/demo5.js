var Rectangle = /** @class */ (function () {
    function Rectangle(l, h) {
        this.length = l;
        this.height = h;
    }
    Rectangle.prototype.getArea = function () {
        var area = Number(this.length) * Number(this.height);
        return area;
    };
    Rectangle.prototype.getParameter = function (l, h) {
        return 2 * (l + h);
    };
    return Rectangle;
}());
var obj = new Rectangle(10, 20);
var area = obj.getArea();
console.log(area);
