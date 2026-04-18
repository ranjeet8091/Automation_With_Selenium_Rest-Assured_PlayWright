const { test, expect } = require('@playwright/test');
const { promises } = require('node:dns');
const fs = require("fs")
const path = require("path");

// test('Rahul shetty page registration' , async({browser}) =>
// {
//     const context = await browser.newContext();
//     const page = await context.newPage();

//     const regiterBtn = page.locator(".login-wrapper-footer-text a")

//     const firstname = page.locator("#firstName")
//     const lastname = page.locator("#lastName");
//     const email = page.locator("#userEmail");
//     const phoneNumber = page.locator("#userMobile");
//     const select = page.locator("//select[@formcontrolname='occupation']");
//     const maleRadio = page.locator("//input[@value='Male']");
//     const userPassword = page.locator("#userPassword");
//     const confirmPassword = page.locator("#confirmPassword");
//     const checkBoxOf18 = page.locator("//input[@formcontrolname='required']");
//     const register = page.locator("#login");

//     await page.goto("https://rahulshettyacademy.com/client/#/auth/login")
//     await page.waitForLoadState('networkidle');
//     await regiterBtn.click();

//     await firstname.fill("Ranjeet12");
//     await lastname.fill("Tiwari")
//     await email.fill("ranjiessettiwari@gmail.com");
//     await phoneNumber.fill("8091737829")
//     await select.selectOption('Engineer');
//     await maleRadio.click();
//     await userPassword.fill("Ra@12334567");
//     await confirmPassword.fill("Ra@12334567");
//     await checkBoxOf18.click();
//     await register.click();

//     const loginbtnafterRegister = await  page.locator("//button[@routerlink='/auth']").click();
//     const userNameField = await page.locator("#userEmail").fill("ranjiessettiwari@gmail.com");
//     const passwordField =await  page.locator("#userPassword").fill("Ra@12334567");
//     const loginBtn =await  page.locator("#login").click();

//     const cardTitles = page.locator(".card-body a")



//     await page.pause();

// }
// )

// test('Test alerts 1nd ', async ({browser})=>{
//    const context = await browser.newContext();
//    const page = await browser.newPage();

//    await page.goto("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");

//    const confirmBtn =  page.locator("#my-alert");
//    // Listner
//     page.on('dialog', async dialog =>{
//         await page.waitForTimeout(5000)
//         console.log(`Dialog message: ${dialog.message()}`)
//         console.log(`Dialog type: ${dialog.type()}`);
//         dialog.accept();
//         console.log("Alert accepted");
//     })

//     await confirmBtn.click();
//     await page.waitForTimeout(5000);


// })

// test('Test alerts 2nd ', async ({browser})=>{
//    const context = await browser.newContext();
//    const page = await browser.newPage();

//    await page.goto("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");

//    const confirmBtn = await page.locator("#my-confirm");
//    // Listner
//     page.on('dialog', async dialog =>{
//         await page.waitForTimeout(5000)
//         console.log(`Dialog message: ${dialog.message()}`)
//         console.log(`Dialog type: ${dialog.type()}`);
//         dialog.accept();
//         console.log("Alert accepted");
//     })

//     await confirmBtn.click();
//     await page.waitForTimeout(5000);

//     // validate
//     const confirmMsg = await page.locator("#confirm-text").textContent();
//     await expect(confirmMsg).toContain("true");

// })

// test('Test alerts 2nd , alert cancel ', async ({browser})=>{
//    const context = await browser.newContext();
//    const page = await browser.newPage();

//    await page.goto("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");

//    const confirmBtn = await page.locator("#my-confirm");
//    // Listner
//     page.on('dialog', async dialog =>{
//         await page.waitForTimeout(5000)
//         console.log(`Dialog message: ${dialog.message()}`)
//         console.log(`Dialog type: ${dialog.type()}`);
//         dialog.dismiss();
//         console.log("Alert dismiss");
//     })

//     await confirmBtn.click();
//     await page.waitForTimeout(5000);

//     // validate
//     const confirmMsg = await page.locator("#confirm-text").textContent();
//     await expect(confirmMsg).toContain("false");

// })

// test('Test alerts 3nd ', async ({browser})=>{
//    const context = await browser.newContext();
//    const page = await browser.newPage();

//    await page.goto("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");

//    const confirmBtn = await page.locator("#my-prompt");
//    // Listner
//     page.on('dialog', async dialog =>{
//         await page.waitForTimeout(5000)
//         console.log(`Dialog message: ${dialog.message()}`)
//         console.log(`Dialog type: ${dialog.type()}`);
//         dialog.accept("Ranjeet");
//         console.log("Alert accepted");
//     })

//     await confirmBtn.click();
//     await page.waitForTimeout(5000);


//     // validate
//     const confirmMsg = await page.locator("#prompt-text").textContent();
//     await expect(confirmMsg).toContain("Ranjeet");

// })

// test('Test alerts 3nd, alert cancle', async ({browser})=>{
//    const context = await browser.newContext();
//    const page = await browser.newPage();

//    await page.goto("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");

//    const confirmBtn = await page.locator("#my-prompt");
//    // Listner
//     page.on('dialog', async dialog =>{
//         await page.waitForTimeout(5000)
//         console.log(`Dialog message: ${dialog.message()}`)
//         console.log(`Dialog type: ${dialog.type()}`);
//         dialog.dismiss();
//         console.log("Alert cancel");
//     })

//     await confirmBtn.click();
//     await page.waitForTimeout(5000);


//     // validate
//     const confirmMsg = await page.locator("#prompt-text").textContent();
//     await expect(confirmMsg).toContain("null");

// })

// test('Child window handling', async({browser})=>{
//     const context = await browser.newContext();
//     const page = await  context.newPage();

//     await page.goto("https://rahulshettyacademy.com/loginpagePractise");
//     const userNameFieldn = await page.locator("#username");

//     // verifying the blinking text at the top
//     const documentLink =  page.locator("a[href*='documents-request']");
//     expect(documentLink).toHaveAttribute("class","blinkingText");

//     const [documentPage] = await Promise.all([
//          context.waitForEvent('page'),
//           documentLink.click()
//     ])

//     const redText = await documentPage.locator(".red").textContent();
//     console.log(redText);

//     const domainName  = redText.split("@")[1].split(".")[0];
//     console.log(domainName);
//     userNameFieldn.type(domainName);

//     await page.pause();

// })




console.log();
//------------------------------------ Assignment ------------------------------------------------------------
console.log("download and upload files");

test('file uploading  on page',async ({browser})=>{

    const context = await browser.newContext();
    const page =await context.newPage();

   await page.goto("https://practice-automation.com/file-upload/");

   const file = __dirname + "/earphones-2602313_640.jpg"
   await page.setInputFiles("#file-upload",file);

    //  await page.setInputFiles("#file-upload", [file1, file2]);

//   Note:
//   Multiple upload works only if input has: <input type="file" multiple>

   // btn locator
   const uploadBtn =await page.locator("#upload-btn");
   const uploadVerify = await page.locator("div.wpcf7-response-output");

   await uploadBtn.click();
   await expect(uploadVerify).toContainText("It has been sent");
   console.log("file uploadexd and verified")
   await page.pause();
})

test('file  dowbloading from page', async ({ browser }) => {

    const context = await browser.newContext();
    const page = await context.newPage();

    await page.goto("https://www.testkru.com/Elements/Files");

    const downloadPromise = page.waitForEvent('download');

    // Click any file link (example: first file)
    await page.locator('a.btn.btn-success').first().click();

    // Capture download
    const download = await downloadPromise;

    // Get file name
    const fileName = download.suggestedFilename();
    console.log("Downloaded file name:", fileName);

    // Save file to custom folder
    const filePath = path.join(__dirname, 'downloads', fileName);

    await download.saveAs(filePath);

    // Verify file exists
    expect(fs.existsSync(filePath)).toBeTruthy();

    console.log("File downloaded and verified successfully");
    await page.pause();
})