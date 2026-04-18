// @ts-check
import { defineConfig, devices } from '@playwright/test';

/**
 * Read environment variables from file.
 * https://github.com/motdotla/dotenv
 */
// import dotenv from 'dotenv';
// import path from 'path';
// dotenv.config({ path: path.resolve(__dirname, '.env') });

/**
 * @see https://playwright.dev/docs/test-configuration
 */
export default defineConfig({
  testDir: './tests',
  /* Run tests in files in parallel */
  timeout: 40*1000,
  fullyParallel: true,
  expect : {
    timeout: 40*10000
  },
  reporter:  [['list'],
      ['allure-playwright',{
        resultDir: 'allure-results',
      }]],
  /* Shared settings for all the projects below. See https://playwright.dev/docs/api/class-testoptions. */
  use: {
      browserName: 'chromium',
      headless:false
  },

});

