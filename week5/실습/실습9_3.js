function convert(user) {
    const userCon = {
        name: user.name,
        age: user.age,
        address: user.address || '주소없음',
        job: user.job || '직업없음',
    }
    return userCon;
}
const result = {
	success: false,
	body: [
		{
			name: 'Aaron',
			age: 10,
			address: null,
		},
		{
			name: 'Baron',
			age: 20,
			address: {
				location: 'Earth'
			},
		},
		{
			name: 'Caron',
			age: 30,
			address: null,
			job: 'Developer',
		},
	]
}
const converted_users = []

// let i = 0
// while(i < result.body.length){
//     const converted_user = convert(result.body[i])
// 	converted_users.push(converted_user)
//     i++;
// }

// for (let i = 0; i < result.body.length; i++) {
// 	const converted_user = convert(result.body[i])
// 	converted_users.push(converted_user)
// }

// for (const element of result.body) {
//     convert(element);
//     converted_users.push(element);
// }


for (const element in result.body) {
    const converted_user = convert(result.body[element]);
    converted_users.push(converted_user);
}
console.log(converted_users)