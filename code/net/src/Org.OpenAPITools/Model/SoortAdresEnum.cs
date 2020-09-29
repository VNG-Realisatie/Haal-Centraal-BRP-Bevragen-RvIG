/* 
 * Bevragingen ingeschreven personen
 *
 * API voor het ontsluiten van gegevens van ingeschreven personen en aanverwante gegevens uit de GBA en RNI. Met deze API worden de actuele gegevens van ingeschreven personen, hun kinderen, partners en ouders ontsloten. <br> Heeft een persoon bijvoorbeeld geen geldige nationaliteit, dan wordt nationaliteit niet geretourneerd. <br> Heeft een persoon een beëindigd partnerschap of huwelijk, dan wordt de partner niet geretourneerd. <br> <br> Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Bevragingen-ingeschreven-personen/tree/master/features) voor nadere toelichting. <br> 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Aanduiding van het soort adres.: * &#x60;woonadres&#x60; - W * &#x60;briefadres&#x60; - B
    /// </summary>
    /// <value>Aanduiding van het soort adres.: * &#x60;woonadres&#x60; - W * &#x60;briefadres&#x60; - B</value>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum SoortAdresEnum
    {
        /// <summary>
        /// Enum Woonadres for value: woonadres
        /// </summary>
        [EnumMember(Value = "woonadres")]
        Woonadres = 1,

        /// <summary>
        /// Enum Briefadres for value: briefadres
        /// </summary>
        [EnumMember(Value = "briefadres")]
        Briefadres = 2

    }

}
