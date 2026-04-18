
const { test } = require("@playwright/test");
const { HomePage } = require("../pages/TravelHomePage");
const { BookingPage } = require("../pages/bookingPage")
const { Purchase } = require("../pages/fillDetailAndPurchase");

test("verify travel page", async ({ browser }) => {
   const context = await browser.newContext();
   const page = await context.newPage();

   const homepage = new HomePage(page);
   const bookingPage = new BookingPage(page);

   await homepage.navigateToApp();
   const source = "Paris";
   const destination = await homepage.checkDestinationWeekOfTheDay();
   await homepage.selectDepartureCitySelector(source);
   await homepage.selectDestinationSelector("London");
   await homepage.clickOnFindFlight();

   await bookingPage.chooseFligt();

   // purchase Detail
   const purchasePage = new Purchase(page);
   purchasePage.setname("Ranjeet");
   purchasePage.setAddress("Himachal");
   purchasePage.setCity("Nalagarh");
   purchasePage.setState("Solan");
   purchasePage.setzipCode("67877");
   purchasePage.setcardType("Visa");
   purchasePage.setCardNumber("7368734");
   purchasePage.setCardMonth("11");
   purchasePage.setCardYear("2011");
   purchasePage.setCardName("Ranjeet Tiwari");
   purchasePage.clickCheckBox();

   await page.waitForTimeout(5000);
   purchasePage.clickOnPurchase();
   await page.pause();
})