// @ts-check
const { test, expect } = require('@playwright/test');

test('Confirm website has the certain texts', async ({ page }) => {
await page.goto('/');

// Expect a website "to contain" a substring.
await expect(page).toHaveTitle(/Making modern finance borderless, trustless and delightful/);

// Expect a title "to contain" a substring.
await expect(page.locator('[id="__next"]')).toContainText('Exit the status quo');

//Assert Tab texts
await expect(page.getByRole('list')).toContainText('ProductsOnboardMetaverse Magna');
await expect(page.getByRole('list')).toContainText('About us');
await expect(page.getByRole('list')).toContainText('Press');
await expect(page.getByRole('list')).toContainText('Careers');



});




test('Confirm website tabs', async ({ page }) => {
await page.goto('/');


// Expect a website "to contain" a substring.
await page.getByText('ProductsOnboardMetaverse Magna').click();

await page.getByText('About us').click();
await expect(page.locator('h1')).toContainText('Our Mission');
await expect(page.locator('[id="__next"]')).toContainText('Democratizing access to economic opportunity for everyday people in frontier markets');



})






test('Confirm About US tab', async ({ page }) => {
await page.goto('/');
await page.getByText('About us').click();
await expect(page.locator('h1')).toContainText('Our Mission');
await expect(page.locator('[id="__next"]')).toContainText('Democratizing access to economic opportunity for everyday people in frontier markets');


await expect(page.locator('h2')).toContainText('Our Core Values');
await expect(page.locator('[id="__next"]')).toContainText('These core values capture the essence of our team culture and business operations.');

//Confirm ownership core value title and subtext
await page.getByRole('heading', { name: 'Ownership' }).click();
await expect(page.locator('[id="__next"]')).toContainText('Ownership');
await expect(page.locator('[id="__next"]')).toContainText('We all play our part in bringing the vision to life. The spirit of ownership and accountability permeates across everything that we do - we don\'t just do it, we do it well.');



})





test('Confirm Press tab', async ({ page }) => {
await page.goto('/');

await page.getByText('Press').click();
await expect(page.locator('h1')).toContainText('Media & Press');
await expect(page.locator('[id="__next"]')).toContainText('Find our press resources and latest headlines, from company announcements to product updates.');

//Confirm download buttons for guides are visible and clickable
await expect(page.getByRole('button', { name: 'Download brand guide' })).toBeVisible();
await expect(page.getByRole('button', { name: 'Download press kit' })).toBeVisible();



})