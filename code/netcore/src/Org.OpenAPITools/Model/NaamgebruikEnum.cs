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
    /// De voorgedefinieerde waarden van naamgebruik volgens de centrale voorzieningen. * &#x60;eigen&#x60; - E * &#x60;eigen_partner&#x60; - N * &#x60;partner&#x60; - P * &#x60;partner_eigen&#x60; - V
    /// </summary>
    /// <value>De voorgedefinieerde waarden van naamgebruik volgens de centrale voorzieningen. * &#x60;eigen&#x60; - E * &#x60;eigen_partner&#x60; - N * &#x60;partner&#x60; - P * &#x60;partner_eigen&#x60; - V</value>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum NaamgebruikEnum
    {
        /// <summary>
        /// Enum Eigen for value: eigen
        /// </summary>
        [EnumMember(Value = "eigen")]
        Eigen = 1,

        /// <summary>
        /// Enum Eigenpartner for value: eigen_partner
        /// </summary>
        [EnumMember(Value = "eigen_partner")]
        Eigenpartner = 2,

        /// <summary>
        /// Enum Partner for value: partner
        /// </summary>
        [EnumMember(Value = "partner")]
        Partner = 3,

        /// <summary>
        /// Enum Partnereigen for value: partner_eigen
        /// </summary>
        [EnumMember(Value = "partner_eigen")]
        Partnereigen = 4

    }

}
