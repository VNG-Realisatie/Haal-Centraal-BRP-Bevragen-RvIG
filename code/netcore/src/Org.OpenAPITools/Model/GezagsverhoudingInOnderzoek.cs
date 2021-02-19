/*
 * Bevragen Ingeschreven Personen RvIG
 *
 * API voor het bevragen van ingeschreven personen uit de basisregistratie personen (BRP), inclusief de registratie niet-ingezeten (RNI). Met deze API kun je personen zoeken en actuele gegevens over personen, kinderen, partners en ouders raadplegen.  Gegevens die er niet zijn of niet actueel zijn krijg je niet terug. Heeft een persoon bijvoorbeeld geen geldige nationaliteit, en alleen een beëindigd partnerschap, dan krijg je geen gegevens over nationaliteit en partner.  Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/tree/v1.2.0/features) voor nadere toelichting.  De API zal door RvIG worden aangeboden. Daarin wordt een aantal afgeleide gegevens niet opgenomen. Daarom bevat deze specificatie minder gegevens dan de specificatie op [BRP-bevragen](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/master/specificatie/genereervariant/openapi.yaml). 
 *
 * The version of the OpenAPI document: 1.2.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Geeft aan welke gegevens van de gezagsverhouding in onderzoek zijn. Zie de [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/v1.1.0/features/in_onderzoek.feature) 
    /// </summary>
    [DataContract(Name = "GezagsverhoudingInOnderzoek")]
    public partial class GezagsverhoudingInOnderzoek : IEquatable<GezagsverhoudingInOnderzoek>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GezagsverhoudingInOnderzoek" /> class.
        /// </summary>
        /// <param name="indicatieCurateleRegister">indicatieCurateleRegister.</param>
        /// <param name="indicatieGezagMinderjarige">indicatieGezagMinderjarige.</param>
        /// <param name="datumIngangOnderzoek">datumIngangOnderzoek.</param>
        public GezagsverhoudingInOnderzoek(bool indicatieCurateleRegister = default(bool), bool indicatieGezagMinderjarige = default(bool), DatumOnvolledig datumIngangOnderzoek = default(DatumOnvolledig))
        {
            this.IndicatieCurateleRegister = indicatieCurateleRegister;
            this.IndicatieGezagMinderjarige = indicatieGezagMinderjarige;
            this.DatumIngangOnderzoek = datumIngangOnderzoek;
        }

        /// <summary>
        /// Gets or Sets IndicatieCurateleRegister
        /// </summary>
        [DataMember(Name = "indicatieCurateleRegister", EmitDefaultValue = false)]
        public bool IndicatieCurateleRegister { get; set; }

        /// <summary>
        /// Gets or Sets IndicatieGezagMinderjarige
        /// </summary>
        [DataMember(Name = "indicatieGezagMinderjarige", EmitDefaultValue = false)]
        public bool IndicatieGezagMinderjarige { get; set; }

        /// <summary>
        /// Gets or Sets DatumIngangOnderzoek
        /// </summary>
        [DataMember(Name = "datumIngangOnderzoek", EmitDefaultValue = false)]
        public DatumOnvolledig DatumIngangOnderzoek { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GezagsverhoudingInOnderzoek {\n");
            sb.Append("  IndicatieCurateleRegister: ").Append(IndicatieCurateleRegister).Append("\n");
            sb.Append("  IndicatieGezagMinderjarige: ").Append(IndicatieGezagMinderjarige).Append("\n");
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
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as GezagsverhoudingInOnderzoek);
        }

        /// <summary>
        /// Returns true if GezagsverhoudingInOnderzoek instances are equal
        /// </summary>
        /// <param name="input">Instance of GezagsverhoudingInOnderzoek to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GezagsverhoudingInOnderzoek input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.IndicatieCurateleRegister == input.IndicatieCurateleRegister ||
                    this.IndicatieCurateleRegister.Equals(input.IndicatieCurateleRegister)
                ) && 
                (
                    this.IndicatieGezagMinderjarige == input.IndicatieGezagMinderjarige ||
                    this.IndicatieGezagMinderjarige.Equals(input.IndicatieGezagMinderjarige)
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
                hashCode = hashCode * 59 + this.IndicatieCurateleRegister.GetHashCode();
                hashCode = hashCode * 59 + this.IndicatieGezagMinderjarige.GetHashCode();
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
