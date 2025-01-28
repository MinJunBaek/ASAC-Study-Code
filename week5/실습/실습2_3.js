function dayFirstAndLast(month = 1) {
  const offset = 9 * 60 * 60 * 1000;
  const year = new Date().getFullYear();

  // const firstDay = new Date(year, month - 1, 1)
  //   .toLocaleString("ko-KR", {
  //     timeZone: "Asia/Seoul",
  //   })
  //   .getDate();
  // const lastDay = new Date(year, month, 0)
  //   .toLocaleString("ko-KR", {
  //     timeZone: "Asia/Seoul",
  //   })
  //   .getDate();

  const firstDay = new Date(Date.UTC(year, month - 1, 1)).getDate();
  const lastDay = new Date(Date.UTC(year, month, 0)).getDate();
  return [firstDay, lastDay];
}

console.log(dayFirstAndLast(2));
const [start, end] = dayFirstAndLast(2);
console.log(`Start of month: ${start}`);
console.log(`End of month: ${end}`);

console.log(new Date(2025, 0, 0).getDate());
