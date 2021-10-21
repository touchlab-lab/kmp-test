//
//  ExampleUITest.swift
//  iosAppUITests
//
//  Created by Gustavo Fão Valvassori on 21/10/21.
//  Copyright © 2021 orgName. All rights reserved.
//

import XCTest

class ExampleUITest: XCTestCase {
    
    lazy var application = XCUIApplication()

    override func setUpWithError() throws {
        continueAfterFailure = false
        application.launch()
    }

    func testApplication_shouldRenderHelloText() {
        let text = application.staticTexts["Hello, iOS!"]
        
        XCTAssert(text.exists)
    }
}
