#
# OEML - REST API
# This section will provide necessary information about the `CoinAPI OEML REST API` protocol. This API is also available in the Postman application: <a href=""https://postman.coinapi.io/"" target=""_blank"">https://postman.coinapi.io/</a>       
# Version: v1
# Contact: support@coinapi.io
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.Synopsis
    Helper function to format debug parameter output.
.Example
    $PSBoundParameters | Out-DebugParameter | Write-Debug
#>
function Out-DebugParameter {
    [CmdletBinding()]
    Param (
        [Parameter(ValueFromPipeline = $true, Mandatory = $true)]
        [AllowEmptyCollection()]
        $InputObject
    )

    Begin {
        $CommonParameters = Get-CommonParameters
    }

    Process {
        $InputObject.GetEnumerator() | Where-Object {
            $CommonParameters -notcontains $_.Key
        } | Format-Table -AutoSize -Property (
            @{
                Name = 'Parameter'
                Expression = {$_.Key}
            },
            @{
                Name = 'Value'
                Expression = {$_.Value}
            }
        ) | Out-String -Stream | ForEach-Object {
            if ($_.Trim()) {
                $_
            }
        }
    }
}
