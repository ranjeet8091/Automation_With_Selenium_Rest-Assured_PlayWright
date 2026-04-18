
const { Vacation } = require("../pages/vacation");
class HomePage {

    constructor(page) {
        this.page = page;
        this.departureCitySelector = page.locator("select[name='fromPort']");
        this.destinationCitySelector = page.locator("select[name='toPort']");
        this.findFlight = this.page.locator("input[type='submit']");
        this.vacationLink = this.page.locator("a[href='vacation.html']");
    }

    async navigateToApp() {
        await this.page.goto("https://blazedemo.com");
    }

    async checkDestinationWeekOfTheDay() {
        await this.vacationLink.click();
        const vacation = new Vacation(this.page);
        const destination = await vacation.returnVacationDestination();
        await vacation.navigateToHome();
        return destination;
    }

    async selectDepartureCitySelector(city) {
        await this.departureCitySelector.selectOption(city);
    }

    async selectDestinationSelector(city) {
        await this.destinationCitySelector.selectOption(city);
    }

    async clickOnFindFlight() {
        await this.findFlight.click();
    }
}

module.exports = { HomePage }