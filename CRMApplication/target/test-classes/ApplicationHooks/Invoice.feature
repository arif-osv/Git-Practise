
@tag
Feature: Invoice
  
  @Create_Invoice
  Scenario Outline: verify functionality for Create the Invoice screen validations with different kind of data types
  Given user is on uat url login page
 Then user enters username  and PassWord "smrev""Osv@1234"
 Then User Create Invoice
 
 Examples:
 
 |InvoiceDate|DueDate|
 