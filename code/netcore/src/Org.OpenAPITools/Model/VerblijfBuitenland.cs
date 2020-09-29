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
    /// De gegevens over het verblijf in het buitenland
    /// </summary>
    [DataContract]
    public partial class VerblijfBuitenland :  IEquatable<VerblijfBuitenland>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="VerblijfBuitenland" /> class.
        /// </summary>
        /// <param name="adresRegel1">Het eerste deel van het adres in het buitenland dat de ingeschreven persoon opgeeft bij vertrek naar het buitenland dan wel waar de ingeschreven persoon in het buitenland verblijft..</param>
        /// <param name="adresRegel2">Het tweede deel van het adres in het buitenland dat de ingeschreven persoon opgeeft bij vertrek naar het buitenland dan wel waar de ingeschreven persoon in het buitenland verblijft..</param>
        /// <param name="adresRegel3">Het derde deel van het adres in het buitenland dat de ingeschreven persoon opgeeft bij vertrek naar het buitenland dan wel waar de ingeschreven persoon in het buitenland verblijft..</param>
        /// <param name="vertrokkenOnbekendWaarheen">Indicatie dat de ingeschreven persoon is vertrokken naar het buitenland, maar dat niet bekend is waar naar toe..</param>
        /// <param name="land">land.</param>
        public VerblijfBuitenland(string adresRegel1 = default(string), string adresRegel2 = default(string), string adresRegel3 = default(string), bool vertrokkenOnbekendWaarheen = default(bool), Waardetabel land = default(Waardetabel))
        {
            this.AdresRegel1 = adresRegel1;
            this.AdresRegel2 = adresRegel2;
            this.AdresRegel3 = adresRegel3;
            this.VertrokkenOnbekendWaarheen = vertrokkenOnbekendWaarheen;
            this.Land = land;
        }
        
        /// <summary>
        /// Het eerste deel van het adres in het buitenland dat de ingeschreven persoon opgeeft bij vertrek naar het buitenland dan wel waar de ingeschreven persoon in het buitenland verblijft.
        /// </summary>
        /// <value>Het eerste deel van het adres in het buitenland dat de ingeschreven persoon opgeeft bij vertrek naar het buitenland dan wel waar de ingeschreven persoon in het buitenland verblijft.</value>
        [DataMember(Name="adresRegel1", EmitDefaultValue=false)]
        public string AdresRegel1 { get; set; }

        /// <summary>
        /// Het tweede deel van het adres in het buitenland dat de ingeschreven persoon opgeeft bij vertrek naar het buitenland dan wel waar de ingeschreven persoon in het buitenland verblijft.
        /// </summary>
        /// <value>Het tweede deel van het adres in het buitenland dat de ingeschreven persoon opgeeft bij vertrek naar het buitenland dan wel waar de ingeschreven persoon in het buitenland verblijft.</value>
        [DataMember(Name="adresRegel2", EmitDefaultValue=false)]
        public string AdresRegel2 { get; set; }

        /// <summary>
        /// Het derde deel van het adres in het buitenland dat de ingeschreven persoon opgeeft bij vertrek naar het buitenland dan wel waar de ingeschreven persoon in het buitenland verblijft.
        /// </summary>
        /// <value>Het derde deel van het adres in het buitenland dat de ingeschreven persoon opgeeft bij vertrek naar het buitenland dan wel waar de ingeschreven persoon in het buitenland verblijft.</value>
        [DataMember(Name="adresRegel3", EmitDefaultValue=false)]
        public string AdresRegel3 { get; set; }

        /// <summary>
        /// Indicatie dat de ingeschreven persoon is vertrokken naar het buitenland, maar dat niet bekend is waar naar toe.
        /// </summary>
        /// <value>Indicatie dat de ingeschreven persoon is vertrokken naar het buitenland, maar dat niet bekend is waar naar toe.</value>
        [DataMember(Name="vertrokkenOnbekendWaarheen", EmitDefaultValue=false)]
        public bool VertrokkenOnbekendWaarheen { get; set; }

        /// <summary>
        /// Gets or Sets Land
        /// </summary>
        [DataMember(Name="land", EmitDefaultValue=false)]
        public Waardetabel Land { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class VerblijfBuitenland {\n");
            sb.Append("  AdresRegel1: ").Append(AdresRegel1).Append("\n");
            sb.Append("  AdresRegel2: ").Append(AdresRegel2).Append("\n");
            sb.Append("  AdresRegel3: ").Append(AdresRegel3).Append("\n");
            sb.Append("  VertrokkenOnbekendWaarheen: ").Append(VertrokkenOnbekendWaarheen).Append("\n");
            sb.Append("  Land: ").Append(Land).Append("\n");
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
            return this.Equals(input as VerblijfBuitenland);
        }

        /// <summary>
        /// Returns true if VerblijfBuitenland instances are equal
        /// </summary>
        /// <param name="input">Instance of VerblijfBuitenland to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VerblijfBuitenland input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AdresRegel1 == input.AdresRegel1 ||
                    (this.AdresRegel1 != null &&
                    this.AdresRegel1.Equals(input.AdresRegel1))
                ) && 
                (
                    this.AdresRegel2 == input.AdresRegel2 ||
                    (this.AdresRegel2 != null &&
                    this.AdresRegel2.Equals(input.AdresRegel2))
                ) && 
                (
                    this.AdresRegel3 == input.AdresRegel3 ||
                    (this.AdresRegel3 != null &&
                    this.AdresRegel3.Equals(input.AdresRegel3))
                ) && 
                (
                    this.VertrokkenOnbekendWaarheen == input.VertrokkenOnbekendWaarheen ||
                    this.VertrokkenOnbekendWaarheen.Equals(input.VertrokkenOnbekendWaarheen)
                ) && 
                (
                    this.Land == input.Land ||
                    (this.Land != null &&
                    this.Land.Equals(input.Land))
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
                if (this.AdresRegel1 != null)
                    hashCode = hashCode * 59 + this.AdresRegel1.GetHashCode();
                if (this.AdresRegel2 != null)
                    hashCode = hashCode * 59 + this.AdresRegel2.GetHashCode();
                if (this.AdresRegel3 != null)
                    hashCode = hashCode * 59 + this.AdresRegel3.GetHashCode();
                hashCode = hashCode * 59 + this.VertrokkenOnbekendWaarheen.GetHashCode();
                if (this.Land != null)
                    hashCode = hashCode * 59 + this.Land.GetHashCode();
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
            // AdresRegel1 (string) maxLength
            if(this.AdresRegel1 != null && this.AdresRegel1.Length > 35)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for AdresRegel1, length must be less than 35.", new [] { "AdresRegel1" });
            }

            // AdresRegel2 (string) maxLength
            if(this.AdresRegel2 != null && this.AdresRegel2.Length > 35)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for AdresRegel2, length must be less than 35.", new [] { "AdresRegel2" });
            }

            // AdresRegel3 (string) maxLength
            if(this.AdresRegel3 != null && this.AdresRegel3.Length > 35)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for AdresRegel3, length must be less than 35.", new [] { "AdresRegel3" });
            }

            yield break;
        }
    }

}
