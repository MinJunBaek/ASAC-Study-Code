# Base Image : Express.js 구동을 위한 Node 버전 명시 <- 메모해둔 node 버전 명시할 것
FROM node:16

# Create app directory
WORKDIR /usr/src/app

# Install app dependencies
# A wildcard(*) is used to ensure both package.json and package-lock.json are copied
COPY package*.json ./

RUN npm install
# If you are building your code for production
# RUN npm ci --only=production

# Bundle app source
COPY . .

EXPOSE 7777
CMD [ "npm", "run", "start" ]