
class Purchase {

    constructor(page) {
        this.page = page;
        this.Name = page.locator("#inputName");
        this.address = page.locator("#address");
        this.city = page.locator("#city");
        this.state = page.locator("#state");
        this.zipCode = page.locator("#zipCode");
        this.cardType = page.locator("select#cardType");
        this.cardNumber = page.locator("#creditCardNumber");
        this.cardMonth = page.locator("#creditCardMonth");
        this.cardYear = page.locator("#creditCardYear");
        this.cardName = page.locator("#nameOnCard");
        this.checkBox = page.locator("#rememberMe");
        this.purchaseBtn = page.locator("input[type='submit']");
    }

    async setname(nameOfUser) {
        await this.Name.fill(nameOfUser);
    }
    async setAddress(Address) {
        await this.address.fill(Address);
    }
    async setCity(userCity) {
        await this.city.fill(userCity);
    }
    async setState(userState) {
        await this.state.fill(userState);
    }
    async setzipCode(zipCode) {
        await this.zipCode.fill(zipCode)
    }
    async setcardType(cardType) {
        await this.cardType.selectOption(cardType);
    }
    async setCardNumber(cardNumber) {
        await this.cardNumber.fill(cardNumber);
    }
    async setCardMonth(month) {
        await this.cardMonth.fill("");
        await this.cardMonth.fill(month);
    }
    async setCardYear(year) {
        await this.cardYear.fill("");
        await this.cardYear.fill(year);
    }

    async setCardName(cardName) {
        await this.cardName.fill(cardName);
    }
    async clickCheckBox() {
        await this.checkBox.click();
    }

    async clickOnPurchase() {
        await this.purchaseBtn.click();
    }

}

module.exports = { Purchase };