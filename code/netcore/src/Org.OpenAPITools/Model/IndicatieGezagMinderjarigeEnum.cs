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
    /// Een aanduiding die aangeeft wie belast is met het gezag over de minderjarige ingeschrevene.: * &#x60;ouder1&#x60; - 1 * &#x60;ouder2&#x60; - 2 * &#x60;derden&#x60; - D * &#x60;ouder1_en_derde&#x60; - 1D * &#x60;ouder2_en_derde&#x60; - 2D * &#x60;ouder1_en_ouder2&#x60; - 12
    /// </summary>
    /// <value>Een aanduiding die aangeeft wie belast is met het gezag over de minderjarige ingeschrevene.: * &#x60;ouder1&#x60; - 1 * &#x60;ouder2&#x60; - 2 * &#x60;derden&#x60; - D * &#x60;ouder1_en_derde&#x60; - 1D * &#x60;ouder2_en_derde&#x60; - 2D * &#x60;ouder1_en_ouder2&#x60; - 12</value>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum IndicatieGezagMinderjarigeEnum
    {
        /// <summary>
        /// Enum Ouder1 for value: ouder1
        /// </summary>
        [EnumMember(Value = "ouder1")]
        Ouder1 = 1,

        /// <summary>
        /// Enum Ouder2 for value: ouder2
        /// </summary>
        [EnumMember(Value = "ouder2")]
        Ouder2 = 2,

        /// <summary>
        /// Enum Derden for value: derden
        /// </summary>
        [EnumMember(Value = "derden")]
        Derden = 3,

        /// <summary>
        /// Enum Ouder1enderde for value: ouder1_en_derde
        /// </summary>
        [EnumMember(Value = "ouder1_en_derde")]
        Ouder1enderde = 4,

        /// <summary>
        /// Enum Ouder2enderde for value: ouder2_en_derde
        /// </summary>
        [EnumMember(Value = "ouder2_en_derde")]
        Ouder2enderde = 5,

        /// <summary>
        /// Enum Ouder1enouder2 for value: ouder1_en_ouder2
        /// </summary>
        [EnumMember(Value = "ouder1_en_ouder2")]
        Ouder1enouder2 = 6

    }

}
