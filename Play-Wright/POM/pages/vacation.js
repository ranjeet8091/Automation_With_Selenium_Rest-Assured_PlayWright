class Vacation{
    constructor(page){
        this.page=page;
        this.VacationText = page.locator('body div.container').nth(1);
        this.travelLinkHome = page.locator("a[href='index.php']");
    }

    async returnVacationDestination(){
        const fullText = await this.VacationText.textContent();
        const destination = await fullText.split(":")[1].split("!")[0].trim();
        return destination;
    }

    async navigateToHome(){
       await this.travelLinkHome.click();
    }
}

module.exports = {Vacation}