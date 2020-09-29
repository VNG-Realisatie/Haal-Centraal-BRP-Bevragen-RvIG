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
    /// Indicators over het in onderzoek zijn van gegevens over de aangaan van het huwelijk van de INGESCHREVEN PERSOON. Zie de [functionele specificaties](https://github.com/VNG-Realisatie/Bevragingen-ingeschreven-personen/blob/master/features/in_onderzoek.feature)
    /// </summary>
    [DataContract]
    public partial class PartnerInOnderzoek :  IEquatable<PartnerInOnderzoek>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PartnerInOnderzoek" /> class.
        /// </summary>
        /// <param name="burgerservicenummer">Indicator die aangeeft of het corresponderende gegeven voor deze persoon in onderzoek is..</param>
        /// <param name="geslachtsaanduiding">Indicator die aangeeft of het corresponderende gegeven voor deze persoon in onderzoek is..</param>
        /// <param name="soortVerbintenis">Indicator die aangeeft of het corresponderende gegeven voor deze persoon in onderzoek is..</param>
        /// <param name="datumIngangOnderzoek">datumIngangOnderzoek.</param>
        public PartnerInOnderzoek(bool burgerservicenummer = default(bool), bool geslachtsaanduiding = default(bool), bool soortVerbintenis = default(bool), DatumOnvolledig datumIngangOnderzoek = default(DatumOnvolledig))
        {
            this.Burgerservicenummer = burgerservicenummer;
            this.Geslachtsaanduiding = geslachtsaanduiding;
            this.SoortVerbintenis = soortVerbintenis;
            this.DatumIngangOnderzoek = datumIngangOnderzoek;
        }
        
        /// <summary>
        /// Indicator die aangeeft of het corresponderende gegeven voor deze persoon in onderzoek is.
        /// </summary>
        /// <value>Indicator die aangeeft of het corresponderende gegeven voor deze persoon in onderzoek is.</value>
        [DataMember(Name="burgerservicenummer", EmitDefaultValue=false)]
        public bool Burgerservicenummer { get; set; }

        /// <summary>
        /// Indicator die aangeeft of het corresponderende gegeven voor deze persoon in onderzoek is.
        /// </summary>
        /// <value>Indicator die aangeeft of het corresponderende gegeven voor deze persoon in onderzoek is.</value>
        [DataMember(Name="geslachtsaanduiding", EmitDefaultValue=false)]
        public bool Geslachtsaanduiding { get; set; }

        /// <summary>
        /// Indicator die aangeeft of het corresponderende gegeven voor deze persoon in onderzoek is.
        /// </summary>
        /// <value>Indicator die aangeeft of het corresponderende gegeven voor deze persoon in onderzoek is.</value>
        [DataMember(Name="soortVerbintenis", EmitDefaultValue=false)]
        public bool SoortVerbintenis { get; set; }

        /// <summary>
        /// Gets or Sets DatumIngangOnderzoek
        /// </summary>
        [DataMember(Name="datumIngangOnderzoek", EmitDefaultValue=false)]
        public DatumOnvolledig DatumIngangOnderzoek { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PartnerInOnderzoek {\n");
            sb.Append("  Burgerservicenummer: ").Append(Burgerservicenummer).Append("\n");
            sb.Append("  Geslachtsaanduiding: ").Append(Geslachtsaanduiding).Append("\n");
            sb.Append("  SoortVerbintenis: ").Append(SoortVerbintenis).Append("\n");
            sb.Append("  DatumIngangOnderzoek: ").Append(DatumIngangOnderzoek).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as PartnerInOnderzoek);
        }

        /// <summary>
        /// Returns true if PartnerInOnderzoek instances are equal
        /// </summary>
        /// <param name="input">Instance of PartnerInOnderzoek to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PartnerInOnderzoek input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Burgerservicenummer == input.Burgerservicenummer ||
                    (this.Burgerservicenummer != null &&
                    this.Burgerservicenummer.Equals(input.Burgerservicenummer))
                ) && 
                (
                    this.Geslachtsaanduiding == input.Geslachtsaanduiding ||
                    (this.Geslachtsaanduiding != null &&
                    this.Geslachtsaanduiding.Equals(input.Geslachtsaanduiding))
                ) && 
                (
                    this.SoortVerbintenis == input.SoortVerbintenis ||
                    (this.SoortVerbintenis != null &&
                    this.SoortVerbintenis.Equals(input.SoortVerbintenis))
                ) && 
                (
                    this.DatumIngangOnderzoek == input.DatumIngangOnderzoek ||
                    (this.DatumIngangOnderzoek != null &&
                    this.DatumIngangOnderzoek.Equals(input.DatumIngangOnderzoek))
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
                if (this.Burgerservicenummer != null)
                    hashCode = hashCode * 59 + this.Burgerservicenummer.GetHashCode();
                if (this.Geslachtsaanduiding != null)
                    hashCode = hashCode * 59 + this.Geslachtsaanduiding.GetHashCode();
                if (this.SoortVerbintenis != null)
                    hashCode = hashCode * 59 + this.SoortVerbintenis.GetHashCode();
                if (this.DatumIngangOnderzoek != null)
                    hashCode = hashCode * 59 + this.DatumIngangOnderzoek.GetHashCode();
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
