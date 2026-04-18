const test = require("node:test");

test('verify welcome page',async({browser})=>{
    const context = browser.newContext();
    const page = context.newPage();

    select_departure(page);


})