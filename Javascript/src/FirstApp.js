//npm run dev
//ecmascript
//redux -> state management
//js is not type safe.

// var, let, const : let prevents duplicate declaration, more secure.
// js -> file based, 10. ders : 1.22

// Variables
//let enes = {id:1, name:"Enes"}
// console.log(enes)

//Functions
// function save(student, note=100) {
//     console.log(student.name + " got"+ note )
// }
// save(enes)
// function save(note=100, student) {
//     console.log(student.name + " got"+ note )
// }
// save(undefined, enes)


// Arrays
// let students = ["Enes", 1, {city:"İstanbul"}];
// console.log(students)

//Rest : ... means array, rest of the parameters are in products array.
let showProducts = function (id, ...products) {
    console.log(id)
    console.log(products)
}
//console.log(typeof showProducts)
//showProducts(1, "Elma", "Armut","Kiraz")

//Spread
let points = [10,20,100,25,70]
//... notations spreads elements of array
// console.log(...points)
// //NaN
// console.log(Math.max(points))
// //proper way
// console.log(Math.max(...points))
// //with strings -> output : A B C D E F
// console.log(..."ABC", "D", ..."EF")

// Destructuring
//destructuring arrays -> small = populations[0], medium = populations[1] ...
let populations = [100000, 200000,300000]
let [small, medium, high] = populations
//console.log(small)

//iterating arrays
function iterate(item){
    console.log(item)
}
//populations.forEach(iterate)

//destructuring objects -> id = category.id, name = category.name
let category = {id:1, name:"beverage"}
let {id,name} = category

//2.50 den devam