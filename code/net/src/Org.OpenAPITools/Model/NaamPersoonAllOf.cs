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
    /// NaamPersoonAllOf
    /// </summary>
    [DataContract]
    public partial class NaamPersoonAllOf :  IEquatable<NaamPersoonAllOf>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NaamPersoonAllOf" /> class.
        /// </summary>
        /// <param name="aanduidingNaamgebruik">aanduidingNaamgebruik.</param>
        /// <param name="inOnderzoek">inOnderzoek.</param>
        public NaamPersoonAllOf(NaamgebruikEnum aanduidingNaamgebruik = default(NaamgebruikEnum), NaamPersoonInOnderzoek inOnderzoek = default(NaamPersoonInOnderzoek))
        {
            this.AanduidingNaamgebruik = aanduidingNaamgebruik;
            this.InOnderzoek = inOnderzoek;
        }
        
        /// <summary>
        /// Gets or Sets AanduidingNaamgebruik
        /// </summary>
        [DataMember(Name="aanduidingNaamgebruik", EmitDefaultValue=false)]
        public NaamgebruikEnum AanduidingNaamgebruik { get; set; }

        /// <summary>
        /// Gets or Sets InOnderzoek
        /// </summary>
        [DataMember(Name="inOnderzoek", EmitDefaultValue=false)]
        public NaamPersoonInOnderzoek InOnderzoek { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NaamPersoonAllOf {\n");
            sb.Append("  AanduidingNaamgebruik: ").Append(AanduidingNaamgebruik).Append("\n");
            sb.Append("  InOnderzoek: ").Append(InOnderzoek).Append("\n");
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
            return this.Equals(input as NaamPersoonAllOf);
        }

        /// <summary>
        /// Returns true if NaamPersoonAllOf instances are equal
        /// </summary>
        /// <param name="input">Instance of NaamPersoonAllOf to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NaamPersoonAllOf input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AanduidingNaamgebruik == input.AanduidingNaamgebruik ||
                    (this.AanduidingNaamgebruik != null &&
                    this.AanduidingNaamgebruik.Equals(input.AanduidingNaamgebruik))
                ) && 
                (
                    this.InOnderzoek == input.InOnderzoek ||
                    (this.InOnderzoek != null &&
                    this.InOnderzoek.Equals(input.InOnderzoek))
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
                if (this.AanduidingNaamgebruik != null)
                    hashCode = hashCode * 59 + this.AanduidingNaamgebruik.GetHashCode();
                if (this.InOnderzoek != null)
                    hashCode = hashCode * 59 + this.InOnderzoek.GetHashCode();
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
