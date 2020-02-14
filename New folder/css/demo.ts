interface Dimension{
    a: Number,
    b: Number
}
function draw(dimension:Dimension){
    console.log(dimension.a)
}
draw({
    a:10,b:20
})
draw({
    a:10,b:20
})
