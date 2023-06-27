// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2023-03-07
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable
import com.hp.jipp.encoding.Enum // Override java Enum

/**
 * "operations-supported" enum as defined in:
 * [APPLE20150505-2](https://ftp.pwg.org/pub/pwg/ipp/registrations/apple-jobops-deprecated-20150505.txt),
 * [APPLE20150505-3](https://ftp.pwg.org/pub/pwg/ipp/registrations/apple-rfc3998-deprecated-20150505.txt),
 * [DEPURI](https://ftp.pwg.org/pub/pwg/ipp/registrations/reg-ippdepuri10-20211215.pdf),
 * [IPPGUPA](https://ftp.pwg.org/pub/pwg/ipp/registrations/reg-ippgupa-20171214.pdf),
 * [PWG5100.13](https://ftp.pwg.org/pub/pwg/candidates/cs-ippnodriver20-20230301-5100.13.pdf),
 * [PWG5100.15](https://ftp.pwg.org/pub/pwg/candidates/cs-ippfaxout10-20131115-5100.15.pdf),
 * [PWG5100.17](https://ftp.pwg.org/pub/pwg/candidates/cs-ippscan10-20140918-5100.17.pdf),
 * [PWG5100.18](https://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf),
 * [PWG5100.22](https://ftp.pwg.org/pub/pwg/candidates/cs-ippsystem10-20191122-5100.22.pdf),
 * [PWG5100.5](https://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject11-20190521-5100.5.pdf),
 * [PWG5100.7](https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext21-20230210-5100.7.pdf),
 * [RFC3380](http://www.iana.org/go/rfc3380),
 * [RFC3995](http://www.iana.org/go/rfc3995),
 * [RFC3996](http://www.iana.org/go/rfc3996),
 * [RFC3998](http://www.iana.org/go/rfc3998),
 * [RFC8011](http://www.iana.org/go/rfc8011).
 */
data class Operation(override val code: Int, override val name: String) : Enum() {

    override fun toString() = super.toString()

    /** An [AttributeType] for a [Operation] attribute. */
    class Type(name: String) : EnumType<Operation>(name, { get(it) })

    /** An [AttributeType] for multiple [Operation] attributes. */
    class SetType(name: String) : EnumType.Set<Operation>(name, { get(it) })

    object Code {
        const val printJob = 0x0002
        const val printUri = 0x0003
        const val validateJob = 0x0004
        const val createJob = 0x0005
        const val sendDocument = 0x0006
        const val sendUri = 0x0007
        const val cancelJob = 0x0008
        const val getJobAttributes = 0x0009
        const val getJobs = 0x000A
        const val getPrinterAttributes = 0x000B
        const val holdJob = 0x000C
        const val releaseJob = 0x000D
        const val restartJob = 0x000E
        const val pausePrinter = 0x0010
        const val resumePrinter = 0x0011
        const val purgeJobs = 0x0012
        const val setPrinterAttributes = 0x0013
        const val setJobAttributes = 0x0014
        const val getPrinterSupportedValues = 0x0015
        const val createPrinterSubscriptions = 0x0016
        const val createJobSubscriptions = 0x0017
        const val getSubscriptionAttributes = 0x0018
        const val getSubscriptions = 0x0019
        const val renewSubscription = 0x001A
        const val cancelSubscription = 0x001B
        const val getNotifications = 0x001C
        const val getResourceAttributes = 0x001E
        const val getResources = 0x0020
        const val enablePrinter = 0x0022
        const val disablePrinter = 0x0023
        const val pausePrinterAfterCurrentJob = 0x0024
        const val holdNewJobs = 0x0025
        const val releaseHeldNewJobs = 0x0026
        const val deactivatePrinter = 0x0027
        const val activatePrinter = 0x0028
        const val restartPrinter = 0x0029
        const val shutdownPrinter = 0x002A
        const val startupPrinter = 0x002B
        const val reprocessJob = 0x002C
        const val cancelCurrentJob = 0x002D
        const val suspendCurrentJob = 0x002E
        const val resumeJob = 0x002F
        const val promoteJob = 0x0030
        const val scheduleJobAfter = 0x0031
        const val cancelDocument = 0x0033
        const val getDocumentAttributes = 0x0034
        const val getDocuments = 0x0035
        const val deleteDocument = 0x0036
        const val setDocumentAttributes = 0x0037
        const val cancelJobs = 0x0038
        const val cancelMyJobs = 0x0039
        const val resubmitJob = 0x003A
        const val closeJob = 0x003B
        const val identifyPrinter = 0x003C
        const val validateDocument = 0x003D
        const val addDocumentImages = 0x003E
        const val acknowledgeDocument = 0x003F
        const val acknowledgeIdentifyPrinter = 0x0040
        const val acknowledgeJob = 0x0041
        const val fetchDocument = 0x0042
        const val fetchJob = 0x0043
        const val getOutputDeviceAttributes = 0x0044
        const val updateActiveJobs = 0x0045
        const val deregisterOutputDevice = 0x0046
        const val updateDocumentStatus = 0x0047
        const val updateJobStatus = 0x0048
        const val updateOutputDeviceAttributes = 0x0049
        const val getNextDocumentData = 0x004A
        const val allocatePrinterResources = 0x004B
        const val createPrinter = 0x004C
        const val deallocatePrinterResources = 0x004D
        const val deletePrinter = 0x004E
        const val getPrinters = 0x004F
        const val shutdownOnePrinter = 0x0050
        const val startupOnePrinter = 0x0051
        const val cancelResource = 0x0052
        const val createResource = 0x0053
        const val installResource = 0x0054
        const val sendResourceData = 0x0055
        const val setResourceAttributes = 0x0056
        const val createResourceSubscriptions = 0x0057
        const val createSystemSubscriptions = 0x0058
        const val disableAllPrinters = 0x0059
        const val enableAllPrinters = 0x005A
        const val getSystemAttributes = 0x005B
        const val getSystemSupportedValues = 0x005C
        const val pauseAllPrinters = 0x005D
        const val pauseAllPrintersAfterCurrentJob = 0x005E
        const val registerOutputDevice = 0x005F
        const val restartSystem = 0x0060
        const val resumeAllPrinters = 0x0061
        const val setSystemAttributes = 0x0062
        const val shutdownAllPrinters = 0x0063
        const val startupAllPrinters = 0x0064
        const val getPrinterResources = 0x0065
        const val getUserPrinterAttributes = 0x0066
        const val restartOnePrinter = 0x0067
    }

    companion object {
        @JvmField val printJob = Operation(Code.printJob, "Print-Job")
        @JvmField val printUri = Operation(Code.printUri, "Print-URI")
        @JvmField val validateJob = Operation(Code.validateJob, "Validate-Job")
        @JvmField val createJob = Operation(Code.createJob, "Create-Job")
        @JvmField val sendDocument = Operation(Code.sendDocument, "Send-Document")
        @JvmField val sendUri = Operation(Code.sendUri, "Send-URI")
        @JvmField val cancelJob = Operation(Code.cancelJob, "Cancel-Job")
        @JvmField val getJobAttributes = Operation(Code.getJobAttributes, "Get-Job-Attributes")
        @JvmField val getJobs = Operation(Code.getJobs, "Get-Jobs")
        @JvmField val getPrinterAttributes = Operation(Code.getPrinterAttributes, "Get-Printer-Attributes")
        @JvmField val holdJob = Operation(Code.holdJob, "Hold-Job")
        @JvmField val releaseJob = Operation(Code.releaseJob, "Release-Job")
        @JvmField val restartJob = Operation(Code.restartJob, "Restart-Job")
        @JvmField val pausePrinter = Operation(Code.pausePrinter, "Pause-Printer")
        @JvmField val resumePrinter = Operation(Code.resumePrinter, "Resume-Printer")
        @JvmField val purgeJobs = Operation(Code.purgeJobs, "Purge-Jobs")
        @JvmField val setPrinterAttributes = Operation(Code.setPrinterAttributes, "Set-Printer-Attributes")
        @JvmField val setJobAttributes = Operation(Code.setJobAttributes, "Set-Job-Attributes")
        @JvmField val getPrinterSupportedValues = Operation(Code.getPrinterSupportedValues, "Get-Printer-Supported-Values")
        @JvmField val createPrinterSubscriptions = Operation(Code.createPrinterSubscriptions, "Create-Printer-Subscriptions")
        @JvmField val createJobSubscriptions = Operation(Code.createJobSubscriptions, "Create-Job-Subscriptions")
        @JvmField val getSubscriptionAttributes = Operation(Code.getSubscriptionAttributes, "Get-Subscription-Attributes")
        @JvmField val getSubscriptions = Operation(Code.getSubscriptions, "Get-Subscriptions")
        @JvmField val renewSubscription = Operation(Code.renewSubscription, "Renew-Subscription")
        @JvmField val cancelSubscription = Operation(Code.cancelSubscription, "Cancel-Subscription")
        @JvmField val getNotifications = Operation(Code.getNotifications, "Get-Notifications")
        @JvmField val getResourceAttributes = Operation(Code.getResourceAttributes, "Get-Resource-Attributes")
        @JvmField val getResources = Operation(Code.getResources, "Get-Resources")
        @JvmField val enablePrinter = Operation(Code.enablePrinter, "Enable-Printer")
        @JvmField val disablePrinter = Operation(Code.disablePrinter, "Disable-Printer")
        @JvmField val pausePrinterAfterCurrentJob = Operation(Code.pausePrinterAfterCurrentJob, "Pause-Printer-After-Current-Job")
        @JvmField val holdNewJobs = Operation(Code.holdNewJobs, "Hold-New-Jobs")
        @JvmField val releaseHeldNewJobs = Operation(Code.releaseHeldNewJobs, "Release-Held-New-Jobs")
        @JvmField val deactivatePrinter = Operation(Code.deactivatePrinter, "Deactivate-Printer")
        @JvmField val activatePrinter = Operation(Code.activatePrinter, "Activate-Printer")
        @JvmField val restartPrinter = Operation(Code.restartPrinter, "Restart-Printer")
        @JvmField val shutdownPrinter = Operation(Code.shutdownPrinter, "Shutdown-Printer")
        @JvmField val startupPrinter = Operation(Code.startupPrinter, "Startup-Printer")
        @JvmField val reprocessJob = Operation(Code.reprocessJob, "Reprocess-Job")
        @JvmField val cancelCurrentJob = Operation(Code.cancelCurrentJob, "Cancel-Current-Job")
        @JvmField val suspendCurrentJob = Operation(Code.suspendCurrentJob, "Suspend-Current-Job")
        @JvmField val resumeJob = Operation(Code.resumeJob, "Resume-Job")
        @JvmField val promoteJob = Operation(Code.promoteJob, "Promote-Job")
        @JvmField val scheduleJobAfter = Operation(Code.scheduleJobAfter, "Schedule-Job-After")
        @JvmField val cancelDocument = Operation(Code.cancelDocument, "Cancel-Document")
        @JvmField val getDocumentAttributes = Operation(Code.getDocumentAttributes, "Get-Document-Attributes")
        @JvmField val getDocuments = Operation(Code.getDocuments, "Get-Documents")
        @JvmField val deleteDocument = Operation(Code.deleteDocument, "Delete-Document")
        @JvmField val setDocumentAttributes = Operation(Code.setDocumentAttributes, "Set-Document-Attributes")
        @JvmField val cancelJobs = Operation(Code.cancelJobs, "Cancel-Jobs")
        @JvmField val cancelMyJobs = Operation(Code.cancelMyJobs, "Cancel-My-Jobs")
        @JvmField val resubmitJob = Operation(Code.resubmitJob, "Resubmit-Job")
        @JvmField val closeJob = Operation(Code.closeJob, "Close-Job")
        @JvmField val identifyPrinter = Operation(Code.identifyPrinter, "Identify-Printer")
        @JvmField val validateDocument = Operation(Code.validateDocument, "Validate-Document")
        @JvmField val addDocumentImages = Operation(Code.addDocumentImages, "Add-Document-Images")
        @JvmField val acknowledgeDocument = Operation(Code.acknowledgeDocument, "Acknowledge-Document")
        @JvmField val acknowledgeIdentifyPrinter = Operation(Code.acknowledgeIdentifyPrinter, "Acknowledge-Identify-Printer")
        @JvmField val acknowledgeJob = Operation(Code.acknowledgeJob, "Acknowledge-Job")
        @JvmField val fetchDocument = Operation(Code.fetchDocument, "Fetch-Document")
        @JvmField val fetchJob = Operation(Code.fetchJob, "Fetch-Job")
        @JvmField val getOutputDeviceAttributes = Operation(Code.getOutputDeviceAttributes, "Get-Output-Device-Attributes")
        @JvmField val updateActiveJobs = Operation(Code.updateActiveJobs, "Update-Active-Jobs")
        @JvmField val deregisterOutputDevice = Operation(Code.deregisterOutputDevice, "Deregister-Output-Device")
        @JvmField val updateDocumentStatus = Operation(Code.updateDocumentStatus, "Update-Document-Status")
        @JvmField val updateJobStatus = Operation(Code.updateJobStatus, "Update-Job-Status")
        @JvmField val updateOutputDeviceAttributes = Operation(Code.updateOutputDeviceAttributes, "Update-Output-Device-Attributes")
        @JvmField val getNextDocumentData = Operation(Code.getNextDocumentData, "Get-Next-Document-Data")
        @JvmField val allocatePrinterResources = Operation(Code.allocatePrinterResources, "Allocate-Printer-Resources")
        @JvmField val createPrinter = Operation(Code.createPrinter, "Create-Printer")
        @JvmField val deallocatePrinterResources = Operation(Code.deallocatePrinterResources, "Deallocate-Printer-Resources")
        @JvmField val deletePrinter = Operation(Code.deletePrinter, "Delete-Printer")
        @JvmField val getPrinters = Operation(Code.getPrinters, "Get-Printers")
        @JvmField val shutdownOnePrinter = Operation(Code.shutdownOnePrinter, "Shutdown-One-Printer")
        @JvmField val startupOnePrinter = Operation(Code.startupOnePrinter, "Startup-One-Printer")
        @JvmField val cancelResource = Operation(Code.cancelResource, "Cancel-Resource")
        @JvmField val createResource = Operation(Code.createResource, "Create-Resource")
        @JvmField val installResource = Operation(Code.installResource, "Install-Resource")
        @JvmField val sendResourceData = Operation(Code.sendResourceData, "Send-Resource-Data")
        @JvmField val setResourceAttributes = Operation(Code.setResourceAttributes, "Set-Resource-Attributes")
        @JvmField val createResourceSubscriptions = Operation(Code.createResourceSubscriptions, "Create-Resource-Subscriptions")
        @JvmField val createSystemSubscriptions = Operation(Code.createSystemSubscriptions, "Create-System-Subscriptions")
        @JvmField val disableAllPrinters = Operation(Code.disableAllPrinters, "Disable-All-Printers")
        @JvmField val enableAllPrinters = Operation(Code.enableAllPrinters, "Enable-All-Printers")
        @JvmField val getSystemAttributes = Operation(Code.getSystemAttributes, "Get-System-Attributes")
        @JvmField val getSystemSupportedValues = Operation(Code.getSystemSupportedValues, "Get-System-Supported-Values")
        @JvmField val pauseAllPrinters = Operation(Code.pauseAllPrinters, "Pause-All-Printers")
        @JvmField val pauseAllPrintersAfterCurrentJob = Operation(Code.pauseAllPrintersAfterCurrentJob, "Pause-All-Printers-After-Current-Job")
        @JvmField val registerOutputDevice = Operation(Code.registerOutputDevice, "Register-Output-Device")
        @JvmField val restartSystem = Operation(Code.restartSystem, "Restart-System")
        @JvmField val resumeAllPrinters = Operation(Code.resumeAllPrinters, "Resume-All-Printers")
        @JvmField val setSystemAttributes = Operation(Code.setSystemAttributes, "Set-System-Attributes")
        @JvmField val shutdownAllPrinters = Operation(Code.shutdownAllPrinters, "Shutdown-All-Printers")
        @JvmField val startupAllPrinters = Operation(Code.startupAllPrinters, "Startup-All-Printers")
        @JvmField val getPrinterResources = Operation(Code.getPrinterResources, "Get-Printer-Resources")
        @JvmField val getUserPrinterAttributes = Operation(Code.getUserPrinterAttributes, "Get-User-Printer-Attributes")
        @JvmField val restartOnePrinter = Operation(Code.restartOnePrinter, "Restart-One-Printer")

        @JvmField val all = listOf(
            printJob,
            printUri,
            validateJob,
            createJob,
            sendDocument,
            sendUri,
            cancelJob,
            getJobAttributes,
            getJobs,
            getPrinterAttributes,
            holdJob,
            releaseJob,
            restartJob,
            pausePrinter,
            resumePrinter,
            purgeJobs,
            setPrinterAttributes,
            setJobAttributes,
            getPrinterSupportedValues,
            createPrinterSubscriptions,
            createJobSubscriptions,
            getSubscriptionAttributes,
            getSubscriptions,
            renewSubscription,
            cancelSubscription,
            getNotifications,
            getResourceAttributes,
            getResources,
            enablePrinter,
            disablePrinter,
            pausePrinterAfterCurrentJob,
            holdNewJobs,
            releaseHeldNewJobs,
            deactivatePrinter,
            activatePrinter,
            restartPrinter,
            shutdownPrinter,
            startupPrinter,
            reprocessJob,
            cancelCurrentJob,
            suspendCurrentJob,
            resumeJob,
            promoteJob,
            scheduleJobAfter,
            cancelDocument,
            getDocumentAttributes,
            getDocuments,
            deleteDocument,
            setDocumentAttributes,
            cancelJobs,
            cancelMyJobs,
            resubmitJob,
            closeJob,
            identifyPrinter,
            validateDocument,
            addDocumentImages,
            acknowledgeDocument,
            acknowledgeIdentifyPrinter,
            acknowledgeJob,
            fetchDocument,
            fetchJob,
            getOutputDeviceAttributes,
            updateActiveJobs,
            deregisterOutputDevice,
            updateDocumentStatus,
            updateJobStatus,
            updateOutputDeviceAttributes,
            getNextDocumentData,
            allocatePrinterResources,
            createPrinter,
            deallocatePrinterResources,
            deletePrinter,
            getPrinters,
            shutdownOnePrinter,
            startupOnePrinter,
            cancelResource,
            createResource,
            installResource,
            sendResourceData,
            setResourceAttributes,
            createResourceSubscriptions,
            createSystemSubscriptions,
            disableAllPrinters,
            enableAllPrinters,
            getSystemAttributes,
            getSystemSupportedValues,
            pauseAllPrinters,
            pauseAllPrintersAfterCurrentJob,
            registerOutputDevice,
            restartSystem,
            resumeAllPrinters,
            setSystemAttributes,
            shutdownAllPrinters,
            startupAllPrinters,
            getPrinterResources,
            getUserPrinterAttributes,
            restartOnePrinter,
        ).map { it.code to it }.toMap()

        operator fun get(value: Int): Operation =
            all[value] ?: Operation(value, "???")
    }
}
