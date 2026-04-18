const { test, expect } = require("@playwright/test");

// test("API testing", async ({ request }) => {
//     const bookName = "ranjeettt";
//     const bookIsbn = "bkis2itt";
//     const bookAisle = "10021tt";
//     const bookAuthor = "amit shaht";
//     const response = await request.post('http://216.10.245.166/Library/Addbook.php', {
//         data: {
//             name: bookName,
//             isbn: bookIsbn,
//             aisle: bookAisle,
//             author: bookAuthor
//         }
//     })
//     const responseBody = await response.json();
//     console.log(responseBody);
//     await expect(response).toBeOK();
//     await expect(response.status()).toBe(200);
//     await expect(responseBody).toHaveProperty('Msg', 'successfully added');
//     await expect(responseBody).toMatchObject({
//         Msg: expect.any(String),
//         ID: expect.any(String)
//     })

// })

// test("Search amd validate get Book API (Negative testing)", async ({ request }) => {
//     const bookName = "ranjeettt";
//     const bookIsbn = "bkis2itt";
//     const bookAisle = "10021tt";
//     const bookAuthor = "amit shaht";
//     const Id = bookIsbn + bookAisle
//     const response = await request.get("http://216.10.245.166/Library/GetBook.php?ID=" + Id);

//     const responseBody = await response.json();
//     console.log(responseBody);

//     await expect(response).toBeOK();
//     await expect(response.status()).toBe(200);
//     await expect(Array.isArray(responseBody)).toBeTruthy();

//     await expect(responseBody[0]).toHaveProperty('book_name',bookName);
//     await expect(responseBody[0]).toHaveProperty('isbn',bookIsbn)
//     await expect(responseBody[0]).toHaveProperty('aisle',bookAisle)
// })

// test('intercept the API url using continue',async({page})=>{
//     await page.route('**/api/ecom/auth/login',async(route)=>{
//         const originalUrl = route.request().url();
//         console.log(`Intercepted original URL: ${originalUrl}`);

//         const newUrl = originalUrl.replace('ecom/auth/login','ecom/#/login');
//         console.log(`Redirectiong to new URL:${newUrl}`);

//         route.continue({
//             url: newUrl,
//         });
//     });

//     await page.goto('https://rahulshettyacademy.com/client/#/auth/login');
//     await page.locator('#userEmail').fill('vibhor1234@gmail.com');
//     await page.locator('#userPassword').fill('Vibhor@12345');
//     await page.locator('#login').click();
// })

test('mock an API response using fulfil', async ({ page }) => {

    const mockOrderedData = {
        "data": {
            "_id": "699533ac1fe6115f6a8f8a73",
            "orderById": "698aa6a248d62064b2f8851a",
            "orderBy": "dbca@gmail.com",
            "productOrderedId": "Wed Feb 18",
            "productName": "JAI HO",
            "country": "Albania",
            "productDescription": "uspolo",
            "productImage": "https://rahulshettyacademy.com/api/ecom/uploads/productImage_1771385712708.png",
            "orderDate": null,
            "orderPrice": "700",
            "__v": 0
        },
        "message": "Orders fetched for customer successfulyy"
    }

    const id = "699533ac1fe6115f6a8f8a73"
    await page.route('**/get-orders-details?id=' + id, async (route) => {
        await route.fulfill({
            status: 200,
            body: JSON.stringify(mockOrderedData)
        })
    })

    await page.goto("https://rahulshettyacademy.com/client/#/auth/login");
    await page.locator("#userEmail").fill('ranjeet@gmail.com');
    await page.locator("#userPassword").fill("Ranjeet@123");
    await page.locator("#login").click();

    await page.locator('button.btn.btn-custom i.fa-handshake-o').click();
    await page.locator('button.btn.btn-primary').nth(0).click();

    await page.pause();
})
