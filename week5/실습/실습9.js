const filter = (object) => {
	return object.age > 19 && object.specialty === 'backend'
}
const users = [
	{ name: 'Aaron', age: 10, specialty: 'frontend' },
	{ name: 'Baron', age: 20, specialty: 'backend' },
	{ name: 'Caron', age: 30, specialty: 'engineer' },
]
const filtered = []

// let i = 0;
// while (i < users.length) {
//     if (filter(users[i])){
//         filtered.push(users[i])
//     }
//     i++
// }

users.forEach(element => {
    if (filter(element)){
        filtered.push(element);
    }
});


console.log(filtered)