/**
 * @license
 * Copyright (c) 2014, 2024, Oracle and/or its affiliates.
 * Licensed under The Universal Permissive License (UPL), Version 1.0
 * as shown at https://oss.oracle.com/licenses/upl/
 * @ignore
 */
import * as ko from "knockout";
import * as Bootstrap from "ojs/ojbootstrap";
import { IntlConverterUtils } from 'ojs/ojconverterutils-i18n';
import ArrayDataProvider = require('ojs/ojarraydataprovider');
import "oj-c/input-text";
import "oj-c/input-number";
import 'oj-c/input-password';
import "oj-c/input-date-text";
import 'oj-c/text-area';
import 'oj-c/input-date-mask';
import 'oj-c/input-date-text';
import 'oj-c/input-month-mask';
import 'oj-c/input-number';
import 'oj-c/input-text';
import 'oj-c/input-password';
import 'oj-c/input-sensitive-text';
import 'oj-c/radioset';
import 'oj-c/form-layout';
import "oj-c/button";
import "oj-c/progress-bar";
import Message = require('ojs/ojmessaging');
import { whenDocumentReady } from "ojs/ojbootstrap";
class CustomersViewModel {  

  customerId: ko.Observable<Number> | ko.Observable<any>;
  constructor() {
    this.customerId = ko.observable(null);
  }
  public getClick = async (event: Event) => {
    // alert('Button was clicked!');
    // this.clickedButton('Clicked');
    // let id = parseInt(this.firstName());
    let url = 'http://localhost:8081/registration/customer/'+this.customerId();
    
    const request = new Request(url, {
      headers: new Headers({
        "Content-Type": "application/json",
      }),
      method: "GET",
    });
    const response = await fetch(request);
    console.log(await response.json());
    }
  }

  public deleteClick = async (event: Event) => {
    // alert('Button was clicked!');
    // this.clickedButton('Clicked');
    // let id = parseInt(this.firstName());
    let url = 'http://localhost:8081/registration/delete/'+this.customerId();
    
    const request = new Request(url, {
      headers: new Headers({
        "Content-Type": "application/json",
      }),
      method: "DELETE",
    });
    const response = await fetch(request);
    console.log(await response.json());
  }
  
}

export = CustomersViewModel;
