const promise = Promise.reject({ success: false });

promise.catch((failled_data) => {
  console.log(failled_data);
});
