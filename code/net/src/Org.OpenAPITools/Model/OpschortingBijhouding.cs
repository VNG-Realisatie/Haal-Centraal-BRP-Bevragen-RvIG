/* 
 * Bevragen Ingeschreven Personen RvIG
 *
 * API voor het bevragen van ingeschreven personen uit de basisregistratie personen (BRP), inclusief de registratie niet-ingezeten (RNI). Met deze API kun je personen zoeken en actuele gegevens over personen, kinderen, partners en ouders raadplegen.  Gegevens die er niet zijn of niet actueel zijn krijg je niet terug. Heeft een persoon bijvoorbeeld geen geldige nationaliteit, en alleen een beëindigd partnerschap, dan krijg je geen gegevens over nationaliteit en partner.  Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/tree/v1.2.0/features) voor nadere toelichting.  De API zal door RvIG worden aangeboden. Daarin wordt een aantal afgeleide gegevens niet opgenomen. Daarom bevat deze specificatie minder gegevens dan de specificatie op [BRP-bevragen](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/master/specificatie/genereervariant/openapi.yaml). 
 *
 * The version of the OpenAPI document: 1.2.0
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
    /// * **datum**: de datum waarop de bijhouding van de persoonsgegevens is gestaakt. 
    /// </summary>
    [DataContract]
    public partial class OpschortingBijhouding :  IEquatable<OpschortingBijhouding>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OpschortingBijhouding" /> class.
        /// </summary>
        /// <param name="reden">reden.</param>
        /// <param name="datum">datum.</param>
        public OpschortingBijhouding(RedenOpschortingBijhoudingEnum reden = default(RedenOpschortingBijhoudingEnum), DatumOnvolledig datum = default(DatumOnvolledig))
        {
            this.Reden = reden;
            this.Datum = datum;
        }
        
        /// <summary>
        /// Gets or Sets Reden
        /// </summary>
        [DataMember(Name="reden", EmitDefaultValue=false)]
        public RedenOpschortingBijhoudingEnum Reden { get; set; }

        /// <summary>
        /// Gets or Sets Datum
        /// </summary>
        [DataMember(Name="datum", EmitDefaultValue=false)]
        public DatumOnvolledig Datum { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OpschortingBijhouding {\n");
            sb.Append("  Reden: ").Append(Reden).Append("\n");
            sb.Append("  Datum: ").Append(Datum).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as OpschortingBijhouding);
        }

        /// <summary>
        /// Returns true if OpschortingBijhouding instances are equal
        /// </summary>
        /// <param name="input">Instance of OpschortingBijhouding to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OpschortingBijhouding input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Reden == input.Reden ||
                    (this.Reden != null &&
                    this.Reden.Equals(input.Reden))
                ) && 
                (
                    this.Datum == input.Datum ||
                    (this.Datum != null &&
                    this.Datum.Equals(input.Datum))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Reden != null)
                    hashCode = hashCode * 59 + this.Reden.GetHashCode();
                if (this.Datum != null)
                    hashCode = hashCode * 59 + this.Datum.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
