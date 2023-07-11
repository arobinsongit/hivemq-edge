// ***********************************************************
// This example support/e2e.ts is processed and
// loaded automatically before your test files.
//
// This is a great place to put global configuration and
// behavior that modifies Cypress.
//
// You can change the location of this file or turn off
// automatically serving support files with the
// 'supportFile' configuration option.
//
// You can read more here:
// https://on.cypress.io/configuration
// ***********************************************************

import 'cypress-axe'
import 'cypress-each'
import '@percy/cypress'

import './commands'

import installLogsCollector from 'cypress-terminal-report/src/installLogsCollector'

installLogsCollector()

// Alternatively you can use CommonJS syntax:
// require('./commands')
