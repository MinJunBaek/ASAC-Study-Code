function addComment(id, comment) {
  const offset = 1000 * 60 * 60 * 9;
  const now = new Date();
  const korNow = new Date(now.getTime() + offset);

  const addComment = {
    id: id,
    comment: comment,
    date: korNow,
  };
  return addComment;
}

const a = addComment(23, "안녕하세요");
console.log(a);
