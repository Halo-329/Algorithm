const a=Array(3)

a[0]="22 21 21"
a[1]="22 21 21"
a[2]="22 21 21"


console.log(a)

const b=a.map(list => list.split(" ").map(Number))

console.log(b) 