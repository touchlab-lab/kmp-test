//
//  ExampleUnitTest.swift
//  iosAppTests
//
//  Created by Gustavo Fão Valvassori on 21/10/21.
//  Copyright © 2021 orgName. All rights reserved.
//

import XCTest
@testable import shared

class ExampleUnitTest: XCTestCase {
    
    private let sut = Platform()

    func testPlatform_returnsCorrectName() {
        let name = sut.platform
        XCTAssertEqual(name, "iOS")
    }
}
