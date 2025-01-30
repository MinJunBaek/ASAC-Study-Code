const promise = Promise.resolve({ success: true });
console.log(promise);

promise.then((success_data) => {
  console.log(success_data);
});
