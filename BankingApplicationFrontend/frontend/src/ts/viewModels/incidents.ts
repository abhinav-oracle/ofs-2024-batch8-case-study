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
class IncidentsViewModel {
  customerFirstName:ko.Observable<Number> | ko.Observable<any>;
  customerLastName: ko.Observable<String> | ko.Observable<any>;
  customerAddress: ko.Observable<String> | ko.Observable<any>;
  customerCity: ko.Observable<String> | ko.Observable<any>;
  customerState: ko.Observable<String> | ko.Observable<any>;
  customerZip: ko.Observable<Number> | ko.Observable<any>;
  customerPhoneNo: ko.Observable<String> | ko.Observable<any>;
  customerEmail: ko.Observable<String> | ko.Observable<any>;
  loginId: ko.Observable<String> | ko.Observable<any>;
  loginPassword: ko.Observable<String> | ko.Observable<any>;

  constructor() {
    this.customerFirstName = ko.observable(null);
    this.customerLastName = ko.observable(null);
    this.customerAddress = ko.observable(null);
    this.customerCity = ko.observable(null);
    this.customerState = ko.observable(null);
    this.customerZip = ko.observable(null);
    this.customerPhoneNo = ko.observable(null);
    this.customerEmail = ko.observable(null);
    this.loginId = ko.observable(null);
    this.loginPassword = ko.observable(null);
  }

  public registerClick = async (event: Event) => {
    // alert('Button was clicked!');
    // this.clickedButton('Clicked');
    // let id = parseInt(this.firstName());
    let url = 'http://localhost:8081/registration/customer';
    const row = {
      "customerFirstName": this.customerFirstName(),
      "customerLastName": this.customerLastName(),
      "customerAddress": this.customerAddress(),
      "customerCity": this.customerCity(),
      "customerState": this.customerState(),
      "customerZip": this.customerZip(),
      "customerPhoneNo": this.customerPhoneNo(),
      "customerEmail": this.customerEmail(),
      "loginId": {"loginId": this.loginId(),
      "loginPassword": this.loginPassword()}
    };
    console.log(row);
    const request = new Request(url, {
      headers: new Headers({
        "Content-Type": "application/json",
      }),
      body: JSON.stringify(row),
      method: "POST",
    });
    const response = await fetch(request);
    console.log(await response.json());
    if(response.json()!= null){
      alert("Registration Successfull");
    }
    
  }
}

export = IncidentsViewModel;
