// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsBodyString.Models
{
    using AcceptanceTestsBodyString;
    using Newtonsoft.Json;
    using Newtonsoft.Json.Converters;
    using System.Net.Http;
    using System.Runtime;
    using System.Runtime.Serialization;

    /// <summary>
    /// Defines values for Colors.
    /// </summary>
    [Newtonsoft.Json.JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
    public enum Colors
    {
        [System.Runtime.Serialization.EnumMember(Value = "red color")]
        Redcolor,
        [System.Runtime.Serialization.EnumMember(Value = "green-color")]
        GreenColor,
        [System.Runtime.Serialization.EnumMember(Value = "blue_color")]
        BlueColor
    }
}
